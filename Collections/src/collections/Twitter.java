package collections;

import java.util.*;
import java.util.HashMap;

import java.util.Map;
import java.util.LinkedList;

import java.util.List;
public class Twitter {

    /** Initialize your data structure here. */
    	public Twitter() {
    		
    	}
        HashMap<Integer, LinkedList<Integer>> followees = new HashMap<Integer, LinkedList<Integer>>();
        HashMap<Integer, LinkedList<Integer>> followers = new HashMap<Integer, LinkedList<Integer>>();
        HashMap<Integer, LinkedList<Integer>> newsfeeds = new HashMap<Integer, LinkedList<Integer>>();
        
        public Twitter(HashMap<Integer, LinkedList<Integer>> followers) {
//        	this.followees = followees;
        	this.followers = followers;
//        	this.newsfeeds = newsfeeds;
        }
    
    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
//        for (List followerList : followers.get(userId)) {
    	LinkedList<Integer> followerList = followers.get(userId);
            for (Integer followerId : followerList) {
                newsfeeds.get(followerId).add(tweetId);
            }
        }
//    }
    
    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId) {
        LinkedList<Integer> newsfeedUserId = new LinkedList<Integer>();
        for (int i = 0; i < 10 && i < newsfeeds.get(userId).size(); i++) {
            newsfeedUserId.add(newsfeeds.get(userId).getFirst());
        }
        return newsfeedUserId;
    }
    
    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {
        followees.get(followerId).add(followeeId);
        followers.get(followeeId).add(followerId);
    }
    
    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {
        followees.get(followerId).remove(followeeId);
        followers.get(followeeId).remove(followerId);
    }
    
    public static void main(String args[]){
    	HashMap<Integer, LinkedList<Integer>> followees = new HashMap<Integer, LinkedList<Integer>>();
        HashMap<Integer, LinkedList<Integer>> followers = new HashMap<Integer, LinkedList<Integer>>();
        HashMap<Integer, LinkedList<Integer>> newsfeeds = new HashMap<Integer, LinkedList<Integer>>();
        
        LinkedList<Integer> ll = new LinkedList<>();
		ll.add(100);
		ll.add(200);
		ll.add(300);
		followers.put(1,ll);
        
        Twitter obj = new Twitter(followers);
        int userId=10;
        int tweetId = 11;
        obj.postTweet(userId,tweetId);
        List<Integer> param_2 = obj.getNewsFeed(userId);
        System.out.println(param_2);
        
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */
