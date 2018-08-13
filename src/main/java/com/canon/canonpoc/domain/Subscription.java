package com.canon.canonpoc.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.UUID;


@Builder
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class Subscription {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     * Read Only
     */
    @Id
    @JsonProperty( access = JsonProperty.Access.READ_ONLY )
    @Column( name = "su_id" )
    private UUID subscriptionId;
    /**
     * OMS Order Identifier
     */
    @Id
    @Column( name = "su_oms_id" )
    private UUID omsOrderId;

    /**
     * User Id
     */
    @Id
    @Column( name = "user_us_id" )
    private UUID userId;

    @Id
    @Column( name = "su_type" )
    private String type;
    @Id
    @Column( name = "su_system" )
    private String system;

    @Id
    @Column( name = "su_startDate" )
    private LocalDateTime startDate;

    @Id
    @Column( name = "su_endDate" )
    private LocalDateTime endDate;

    @Id
    @Column( name = "su_status" )
    private String subscriptionStatus;

    @Id
    @Column( name = "su_deviceStatus" )
    private String deviceStatus;

    @Id
    @Column( name = "su_serialNumber" )
    private String serialNumber;

    @Id
    @Column( name = "su_printerId" )
    private String printerId;

    @Id
    @Column( name = "su_modelName" )
    private String modelName;

    @Id
    @Column( name = "su_deviceSKU" )
    private String deviceSKU;

    @Id
    @Column( name = "su_shippingAddress" )
    private String shippingAddress;

    @Id
    @Column( name = "su_billingAddress" )
    private String billingAddress;

    @Id
    @Column( name = "su_paymentToken" )
    private String paymentToken;



}
