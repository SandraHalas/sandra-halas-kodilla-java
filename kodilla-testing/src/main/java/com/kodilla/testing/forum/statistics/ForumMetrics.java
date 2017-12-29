package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class ForumMetrics{
    Statistics statistics;
    private double numberOfUsers;
    private double numberOfPosts;
    private double numberOfComments;
    private double avgPostPerUser;
    private double avgCommentPerUser;
    private double avgCommentPerPost;

    public ForumMetrics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics){
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        if(numberOfUsers!=0){
            avgPostPerUser = numberOfPosts/numberOfUsers;
            avgCommentPerUser = numberOfComments/numberOfUsers;
        }
        if((numberOfPosts!=0)){
            avgCommentPerPost = numberOfComments/numberOfPosts;
        }
    }

    public double getAvgPostPerUser(){
        return avgPostPerUser;
    }

    public double getAvgCommentPerUser(){
        return avgCommentPerUser;
    }

    public double getAvgCommentPerPost(){
        return avgCommentPerPost;
    }

    public void ShowStatistics(){
        System.out.println("No. of users: " + numberOfUsers + " / no. of posts: " + numberOfPosts + " / no. of comments: " + numberOfComments + "\nAverages - post/user:" + avgPostPerUser + "comment/user" + avgCommentPerUser + "comment/post" + avgCommentPerPost);
    }
}
