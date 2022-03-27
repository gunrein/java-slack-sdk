package com.slack.api.methods.request.team;

import com.slack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Data;

/**
 * https://api.slack.com/methods/team.billingInfo
 */
@Data
@Builder
public class TeamBillingInfoRequest implements SlackApiRequest {

    /**
     * Authentication token. Requires scope: `team.billing:read`
     */
    private String token;

}