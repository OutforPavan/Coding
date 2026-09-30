package com.coding.leetcode.coding.Omnissa.dsa.practical;

import com.coding.leetcode.coding.Omnissa.support.ExampleRunner;
import java.util.List;

/**
 * D20 | P1 | Implement publisher subscriptions and a newest-first news feed.
 * <p>Problem: Implement publisher subscriptions and a newest-first news feed.
 * <p>Contract: subscribe/unsubscribe use nonblank user and publisher IDs; repeated calls are idempotent. publish accepts globally unique post IDs and stores posts. getFeed returns up to limit posts from current subscriptions, including posts published before subscribing; order by descending timestampMillis, then descending post ID. limit is nonnegative; no subscriptions yields empty. Return a snapshot. Do not use sorting library calls.
 * <p>Evidence: R S10: C# OA with subscribe/unsubscribe and restrictions against LINQ and sorting. This Java API, post schema, time ordering and tie rules are illustrative assumptions requiring clarification in a real interview. <a href="https://www.glassdoor.com/Interview/Omnissa-Software-Engineer-Interview-Questions-EI_IE10115166.0,7_KO8,25.htm">S10</a>
 * <p>This is an unsolved practice scaffold. Implement the TODO methods, then run main.
 */
public class NewsFeedSubscriptions {
    public record Post(long id, String publisherId, String text, long timestampMillis) { }

    public NewsFeedSubscriptions() {
        // TODO: initialize subscription and post state when implementing this exercise.
    }

    public void subscribe(String userId, String publisherId) {
        throw new UnsupportedOperationException("TODO: implement subscribe");
    }

    public void unsubscribe(String userId, String publisherId) {
        throw new UnsupportedOperationException("TODO: implement unsubscribe");
    }

    public void publish(Post post) {
        throw new UnsupportedOperationException("TODO: implement publish");
    }

    public List<Post> getFeed(String userId, int limit) {
        throw new UnsupportedOperationException("TODO: implement getFeed");
    }

    public static void main(String[] args) {
        String userId = "reader";
        Post earlier = new Post(1L, "tech", "First", 1000L);
        Post later = new Post(2L, "tech", "Second", 2000L);
        ExampleRunner.run("D20 subscribed feed", "reader subscribes to tech; publish post 1 then post 2; limit=2", "post IDs [2, 1]", () -> {
            NewsFeedSubscriptions service = new NewsFeedSubscriptions();
            service.subscribe(userId, "tech");
            service.publish(earlier);
            service.publish(later);
            return service.getFeed(userId, 2);
        });
        ExampleRunner.run("D20 unsubscribe", "subscribe then unsubscribe tech", "[]", () -> {
            NewsFeedSubscriptions service = new NewsFeedSubscriptions();
            service.subscribe(userId, "tech");
            service.publish(earlier);
            service.unsubscribe(userId, "tech");
            return service.getFeed(userId, 10);
        });
        ExampleRunner.run("D20 new reader", "reader has no subscriptions", "[]", () -> new NewsFeedSubscriptions().getFeed(userId, 10));
    }
}
