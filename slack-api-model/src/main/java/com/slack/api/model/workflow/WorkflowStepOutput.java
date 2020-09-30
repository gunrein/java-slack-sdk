package com.slack.api.model.workflow;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <pre>
 * {
 * 	"name":"ticket_id",
 * 	"type":"text",
 * 	"label":"Ticket ID"
 * }
 * </pre>
 * <p>
 * https://api.slack.com/reference/workflows/workflow_step#output
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WorkflowStepOutput {

    /**
     * Developer defined name that will be used as reference during execution.
     */
    private String name;

    /**
     * Type of the expected input. Can be text, channel or user.
     */
    private String type;

    /**
     * Label of this input field displayed to the user.
     */
    private String label;

}
