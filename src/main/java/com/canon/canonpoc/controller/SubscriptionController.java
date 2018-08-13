package com.canon.canonpoc.controller;


import com.canon.canonpoc.domain.Subscription;
import com.canon.canonpoc.service.SubscriptionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class SubscriptionController {

    @Autowired
    private SubscriptionService service;

    private static final Logger logger = LoggerFactory.getLogger( SubscriptionController.class );

    /**
     * Get Subscription Details
     *
     *
     * @return
     */
    @RequestMapping(name= "/subscription",method = RequestMethod.GET )
    public Subscription getSubscription(@RequestParam( value = "subscriptionId", required = true ) String subscriptionId)
    {
        logger.info( "get Subscription record for a user with SubscriptionId: {}",subscriptionId);
        return service.getSubscription(UUID.fromString(subscriptionId));
    }
}
