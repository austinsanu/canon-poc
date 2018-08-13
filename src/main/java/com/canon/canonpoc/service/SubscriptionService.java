package com.canon.canonpoc.service;


import com.canon.canonpoc.domain.Subscription;
import com.canon.canonpoc.repository.SubscriptionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class SubscriptionService {

    @Autowired
    private SubscriptionRepository subscriptionRepository;

    private static final Logger logger = LoggerFactory.getLogger(SubscriptionService.class);

    public Subscription getSubscription(UUID subscriptionId)
    {
        logger.info("Get Subscription for the ID:{}", subscriptionId);
        Subscription subscription = subscriptionRepository.getSubscription(subscriptionId);

        return subscription;
    }


}
