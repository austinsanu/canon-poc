package com.canon.canonpoc.repository;

import com.canon.canonpoc.domain.Subscription;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.UUID;

@Repository
public class SubscriptionRepository {


    public Subscription getSubscription(UUID subscriptionId) {
        return new Subscription(subscriptionId,UUID.randomUUID(),UUID.randomUUID(),"event-based","ESTORE",LocalDateTime.now(),LocalDateTime.MAX,"Registered","ACTIVE",
                "123-456-7898","ABC-DEF-1234","PIXMA-COLOR","ABCD123ADSD","1 Canon Park, Melville , NY -11747","1 Canon Park, Melville , NY -11747","ASDASDAS232");

    }
}
