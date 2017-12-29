package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumMetricsTestSuite {
    @Test
    public void testAvgPos0PerUser100(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        for(int n = 0; n < 100; n++) {
            users.add("" + n);
        }
        when(statisticsMock.usersNames()).thenReturn(users);

        int postsCount = 0;
        when(statisticsMock.postsCount()).thenReturn(postsCount);

        ForumMetrics forumMetrics = new ForumMetrics(statisticsMock);

        //When
        forumMetrics.calculateAdvStatistics(statisticsMock);
        double avgPos0PerUser100 = forumMetrics.getAvgPostPerUser();

        //Then
        Assert.assertEquals(0, avgPos0PerUser100, 0);
    }

    @Test
    public void testAvgPos1000PerUser100(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        for(int n = 0; n < 100; n++) {
            users.add("" + n);
        }
        when(statisticsMock.usersNames()).thenReturn(users);

        int postsCount = 1000;
        when(statisticsMock.postsCount()).thenReturn(postsCount);

        ForumMetrics forumMetrics = new ForumMetrics(statisticsMock);

        //When
        forumMetrics.calculateAdvStatistics(statisticsMock);
        double avgPos1000PerUser100 = forumMetrics.getAvgPostPerUser();

        //Then
        Assert.assertEquals(10, avgPos1000PerUser100, 0);
    }

    @Test
    public void testAvgPos0PerUser0(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(users);

        int postsCount = 0;
        when(statisticsMock.postsCount()).thenReturn(postsCount);

        ForumMetrics forumMetrics = new ForumMetrics(statisticsMock);

        //When
        forumMetrics.calculateAdvStatistics(statisticsMock);
        double avgPos0PerUser0 = forumMetrics.getAvgPostPerUser();

        //Then
        Assert.assertEquals(0, avgPos0PerUser0, 0);
    }

    @Test
    public void testAvgPos1000PerUser0(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(users);

        int postsCount = 1000;
        when(statisticsMock.postsCount()).thenReturn(postsCount);

        ForumMetrics forumMetrics = new ForumMetrics(statisticsMock);

        //When
        forumMetrics.calculateAdvStatistics(statisticsMock);
        double avgPos1000PerUser0 = forumMetrics.getAvgPostPerUser();

        //Then
        Assert.assertEquals(0, avgPos1000PerUser0, 0);
    }

    @Test
    public void testAvgComment0PerUser100(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        for(int n = 0; n < 100; n++) {
            users.add("" + n);
        }
        when(statisticsMock.usersNames()).thenReturn(users);

        int commentsCount = 0;
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        ForumMetrics forumMetrics = new ForumMetrics(statisticsMock);

        //When
        forumMetrics.calculateAdvStatistics(statisticsMock);
        double avgComment0PerUser100 = forumMetrics.getAvgCommentPerUser();

        //Then
        Assert.assertEquals(0, avgComment0PerUser100, 0);
    }

    @Test
    public void testAvgComment6PerPost3(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        int commentsCount = 6;
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        int postsCount = 3;
        when(statisticsMock.postsCount()).thenReturn(postsCount);

        ForumMetrics forumMetrics = new ForumMetrics(statisticsMock);

        //When
        forumMetrics.calculateAdvStatistics(statisticsMock);
        double avgComment6PerPost3 = forumMetrics.getAvgCommentPerPost();

        //Then
        Assert.assertEquals(2, avgComment6PerPost3, 0);
    }

    @Test
    public void testAvgComment3PerPost6(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        int commentsCount = 3;
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        int postsCount = 6;
        when(statisticsMock.postsCount()).thenReturn(postsCount);

        ForumMetrics forumMetrics = new ForumMetrics(statisticsMock);

        //When
        forumMetrics.calculateAdvStatistics(statisticsMock);
        double avgComment3PerPost6 = forumMetrics.getAvgCommentPerPost();

        //Then
        Assert.assertEquals(0.5, avgComment3PerPost6, 0);
    }
}
