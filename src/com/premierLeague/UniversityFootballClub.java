package com.premierLeague;

public class UniversityFootballClub extends FootballClub{

    private String nickName; //short form name or nickname of the club if have
    private String universityName; //name of the uni

    public UniversityFootballClub(String nickName , String universityName,String howManyWins,String howManyDraws,String howManyDefeats,String numbersOfGoalsReceived,String numbersOfGoalsScored
            ,String currentlyPoints,String numbersOfMatchesPlayed,String nameOfTheClub,String locationOfTheClub,String numbersOfMembers,String clubID) {
        super(nameOfTheClub,locationOfTheClub,numbersOfMembers,clubID);
        this.nickName=nickName;
        this.universityName=universityName;
    }

    //getters and setters

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName=nickName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

}
