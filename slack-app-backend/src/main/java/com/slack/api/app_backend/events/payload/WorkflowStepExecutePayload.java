package com.slack.api.app_backend.events.payload;

import com.slack.api.model.event.WorkflowStepExecuteEvent;
import lombok.Data;

import java.util.List;

@Data
public class WorkflowStepExecutePayload implements EventsApiPayload<WorkflowStepExecuteEvent> {

    private String token;
    private String enterpriseId;
    private String teamId;
    private String apiAppId;
    private String type;
    private List<String> authedUsers;
    private List<String> authedTeams;
    private String eventId;
    private Integer eventTime;
    private String eventContext;

    private WorkflowStepExecuteEvent event;
}
