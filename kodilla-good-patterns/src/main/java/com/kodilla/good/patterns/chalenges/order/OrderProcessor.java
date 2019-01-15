//package com.kodilla.good.patterns.chalenges.order;
//
//import com.kodilla.good.patterns.chalenges.OrderRequest;
//import com.kodilla.good.patterns.chalenges.OrderService;
//
//public class OrderProcessor {
//
//    private PaymentService paymentService;
//    private OrderService orderService;
//    private DeliveryService deliveryService;
//
//    public OrderProcessor(PaymentService paymentService,
//                          OrderService orderService, DeliveryService deliveryService) {
//        this.paymentService = paymentService;
//        this.orderService = orderService;
//        this.deliveryService = deliveryService;
//    }
//
//    public OrderDto process(OrderRequest orderRequest) {
//        boolean isOrdered = orderService.createOrder(orderRequest.getUser(), orderRequest.getInvoice());
//        if (isOrdered) {
//            boolean isPaid = paymentService.pay(orderRequest.getInvoice());
//            if (isPaid) {
//                boolean ordered = orderService.createOrder(orderRequest.getUser(), orderRequest.getInvoice());
//                boolean paid = false;
//                if (ordered) {
//                    paid = paymentService.pay(orderRequest.getInvoice());
//                    if (paid) {
//                        deliveryService.deliverTo(orderRequest.getUser());
//                        return new OrderDto(orderRequest.getUser(), orderRequest.getInvoice(), true, true);
//                    } else {
//                        return new OrderDto(orderRequest.getUser(), orderRequest.getInvoice(), true, false);
//                    }
//                } else return new OrderDto(orderRequest.getUser(), orderRequest.getInvoice(), false, false);
//            }
//            return new OrderDto(orderRequest.getUser(), orderRequest.getInvoice(), ordered, paid);
//        }
//    }
