package com.gb.codingplatform.Services.LeaderBoardService;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.gb.codingplatform.Enums.Order;
import com.gb.codingplatform.Models.GeneralUser;
import com.gb.codingplatform.Repository.ContestRepository.ContestDB;
import com.gb.codingplatform.Services.ViewService.View;

public class ViewLeaderBoard implements View {

    int contest_id;
    ContestDB contestDB;
    Order order;

    @Override
    public void view(ContestDB contestDB) {

        List<GeneralUser> list = contestDB.getContest_id_to_contest().get(contest_id).getParticipants();
        Collections.sort(list, new Comparator<GeneralUser>() {

            public int compare(GeneralUser o1, GeneralUser o2) {

                if (order.equals(Order.DESC))
                    return o1.getRating() > o2.getRating() ? 1 : 0;
                else
                    return o1.getRating() < o2.getRating() ? 1 : 0;
            }
        });
        System.out.println("LeaderBoard...................");
        System.out.println("Name Rating");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + " " + list.get(i).getRating());
        }

    }

    public int getContest_id() {
        return this.contest_id;
    }

    public void setContest_id(int contest_id) {
        this.contest_id = contest_id;
    }

    public Order getOrder() {
        return this.order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

}
