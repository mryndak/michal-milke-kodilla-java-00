package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> theForumUserList = new ArrayList<ForumUser>();

    public Forum() {
        theForumUserList.add(new ForumUser(1, "Bob", 'M', LocalDate.of(1980, 2, 7), 13));
        theForumUserList.add(new ForumUser(2, "Marry", 'F', LocalDate.of(1994, 5, 23), 15));
        theForumUserList.add(new ForumUser(3, "Colin", 'M', LocalDate.of(1968, 12, 9), 25));
        theForumUserList.add(new ForumUser(4, "Julia", 'F', LocalDate.of(1977, 9, 16), 125));
        theForumUserList.add(new ForumUser(5, "Jill", 'M', LocalDate.of(1989, 5, 28), 27));
        theForumUserList.add(new ForumUser(6, "Henry", 'M', LocalDate.of(1994, 11, 4), 241));
        theForumUserList.add(new ForumUser(7, "Valerie", 'F', LocalDate.of(1983, 4, 15), 84));
        theForumUserList.add(new ForumUser(8, "Eddie", 'M', LocalDate.of(2003, 8, 21), 31));
        theForumUserList.add(new ForumUser(9, "Chris", 'M', LocalDate.of(2013, 1, 31), 72));
    }

    public List<ForumUser> getTheForumUserList() {
        return new ArrayList<>(theForumUserList);
    }
}
