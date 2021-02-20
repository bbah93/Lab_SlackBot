package com.floreo.bbah;

import com.floreo.bbah.network.Slack;

public class Main {

    public static void main(String[] args) {

        Bot myBot = new Bot();

        myBot.testApi();
        myBot.listChannels();

        myBot.listMessages(Slack.BOTS_CHANNEL_ID);
        myBot.sendMessageToBotsChannel("Hey, what's up");
        myBot.sendMessageToBotsChannel("Glorina is low key coding y'all"+"https://www.celebsfacts.com/wp-content/uploads/2017/07/Lauryn-Hill.jpg");

        // Post "Hello, world!" to the #bots channel
        //myBot.sendMessage("Hello, world!");

        // Post a pineapple photo to the #bots channel
        //myBot.sendMessage("http://weknowyourdreams.com/images/pineapple/pineapple-07.jpg");

    }
}