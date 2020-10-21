package com.floreo.bbah;

import com.floreo.bbah.network.Slack;

public class Main {

    public static void main(String[] args) {

        Bot myBot = new Bot();

        myBot.testApi();

        myBot.listChannels();

        myBot.listMessages(Slack.BOTS_CHANNEL_ID);

        myBot.listMessages(Slack.BOTS_CHANNEL_ID);

        myBot.sendMessageToBotsChannel("http://weknowyourdreams.com/images/pineapple/pineapple-07.jpg\"");

        // Post "Hello, world!" to the #bots channel

        myBot.sendMessageToBotsChannel("Hello World ");
        //myBot.sendMessageToBotsChannel(" https://fitengezondnu.files.wordpress.com/2014/10/healthy-foods-for-kidneys.jpg");

        // Post a pineapple photo to the #bots channel
        // myBot.sendMessage("http://weknowyourdreams.com/images/pineapple/pineapple-07.jpg");
    }
}
