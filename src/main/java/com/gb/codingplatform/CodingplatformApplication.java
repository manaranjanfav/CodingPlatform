package com.gb.codingplatform;


import com.gb.codingplatform.Enums.Order;
import com.gb.codingplatform.Models.Admin;
import com.gb.codingplatform.Models.Contest;
import com.gb.codingplatform.Models.GeneralUser;
import com.gb.codingplatform.Services.LeaderBoardService.ViewLeaderBoard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodingplatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodingplatformApplication.class, args);

		Admin admin = new Admin();
		admin.createuserdb();
		admin.createcontestdb();

		GeneralUser A = new GeneralUser();
		GeneralUser B = new GeneralUser();
		GeneralUser C = new GeneralUser();
		GeneralUser D = new GeneralUser();

		A.setId(1);
		B.setId(2);
		C.setId(3);
		D.setId(4);

		A.setName("A");
		B.setName("B");
		C.setName("C");
		D.setName("D");

		Contest contest = A.createcontest(A.getId(),admin.getContestDB());
		B.attendcontest(contest,B);
		C.attendcontest(contest,C);
		D.attendcontest(contest,D);

		A.runcontest(contest);

		ViewLeaderBoard viewLeaderBoard = new ViewLeaderBoard();
		viewLeaderBoard.setContest_id(contest.getContest_id());
		viewLeaderBoard.setOrder(Order.ASC);
		viewLeaderBoard.view(admin.getContestDB());
		

	}

}
