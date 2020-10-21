package com.floreo.bbah;

import com.floreo.bbah.network.Slack;

public class Main {

    public static void main(String[] args) {

        Bot myBot = new Bot();

        myBot.testApi();

        myBot.listChannels();

        myBot.listMessages(Slack.BOTS_CHANNEL_ID);

        myBot.listMessages(Slack.BOTS_CHANNEL_ID);

        //myBot.sendMessageToBotsChannel("http://weknowyourdreams.com/images/pineapple/pineapple-07.jpg\"");

        // Post "Hello, world!" to the #bots channel
        myBot.sendMessageToBotsChannel("Hello from theborg!");
        myBot.sendMessageToBotsChannel(" https://akns-images.eonline.com/eol_images/Entire_Site/2016912/rs_1024x759-161012111018-1024.The-Borg-Star-Trek-The-Next-Generation.ms.101216.jpg");

        // Post a pineapple photo to the #bots channel
        // myBot.sendMessage("http://weknowyourdreams.com/images/pineapple/pineapple-07.jpg");
    }
}
