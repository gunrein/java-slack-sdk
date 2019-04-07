package com.github.seratch.jslack.api.model.event;

import com.github.seratch.jslack.common.json.GsonFactory;
import com.google.gson.Gson;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TeamDomainChangeEventTest {

    @Test
    public void deserialize() {
        String json = "{\n" +
                "    \"type\": \"team_domain_change\",\n" +
                "    \"url\": \"https://my.slack.com\",\n" +
                "    \"domain\": \"my\"\n" +
                "}";
        TeamDomainChangeEvent event = GsonFactory.createSnakeCase().fromJson(json, TeamDomainChangeEvent.class);
        assertThat(event.getType(), is("team_domain_change"));
        assertThat(event.getUrl(), is("https://my.slack.com"));
        assertThat(event.getDomain(), is("my"));
    }

    @Test
    public void serialize() {
        Gson gson = GsonFactory.createSnakeCase();
        TeamDomainChangeEvent event = new TeamDomainChangeEvent();
        String generatedJson = gson.toJson(event);
        String expectedJson = "{\"type\":\"team_domain_change\"}";
        assertThat(generatedJson, is(expectedJson));
    }

}