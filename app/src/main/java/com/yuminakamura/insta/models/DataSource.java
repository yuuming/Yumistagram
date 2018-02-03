package com.yuminakamura.insta.models;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by yuminakamura on 2018-01-26.
 */

public class DataSource {

    static ArrayList<TimeLine> timeLineLists = new ArrayList<>();
    static ArrayList<UserPost> userPostLists = new ArrayList<>();

    private static final String[] timelineUsernames = {
            "Yuumi",
            "Jaewon",
            "Kento",
            "Sayaka"
    };

    private static final String[] timelineUserImages = {
            "https://encrypted-tbn0Image.gstatic.com/images?q=tbn:ANd9GcQ1Hta2HGlh5q_Ih6bHaJnOfHqEDfF4rLv5SeB64UReNZolZ0KB",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT3txWR1VnvBnZ1GU9FHKU4H_r6owCHs83CZ_rjqmLmpCnj4jb4_w",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSEvsXv5qJyIWVqlT6ow4xAigMBvA-VrYd5hCeRU7wPDlF911xe",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiuafUmGudjFGoPou5Pg70xmwMy4U_MxVNuMKuXo-RDCPourE5"};

    private static final String[] timelineimages = {
            "https://pbs.twimg.com/media/DNPCQj2VQAMQstm.jpg",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQ-Ys4vXTh3sCJ11DY28UBKg4q2LiKh-afEb-Mb-mlnr8pes4R",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRZJLKVge0H2nK9zyG5HfzTWb8DKdVrHsPCWYrO73ZxH33OA3of",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT9Y2yaCkiWPyr8-m895g4PILnWBuFo0-d2rw_b_829ntQFAGTBMw",
    };

    private static final String[] timelineMessages = {
            "so happy",
            "yummy yummy ",
            "sunny days :)",
            "what a bad day..."
    };

    private static final String[] profileNames = {
            "Alireza",
            "Alireza",
            "Alireza",
            "Alireza"
    };

    private static final String[] profileImage = {
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRfOT20ZAeTXOkB4_INObGdVCtPioyRL8Zel_u0DBvAIZ4h_UzC",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRfOT20ZAeTXOkB4_INObGdVCtPioyRL8Zel_u0DBvAIZ4h_UzC",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRfOT20ZAeTXOkB4_INObGdVCtPioyRL8Zel_u0DBvAIZ4h_UzC",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRfOT20ZAeTXOkB4_INObGdVCtPioyRL8Zel_u0DBvAIZ4h_UzC"
    };


    private static String[] UserPostPictures = {
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR6sbrpPqjSLw1w-mkU35Syz2xCwlHDHErQ-Wj70FKzuCwrM9SP",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQO8HMlma6BuK-ssWuR5HpdsRSXSqsf_fxm3Bo5Pleq2rMxdl0T",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSsRBh2ftIXuE3BdV3yccigTcxRE8gh_zI6CDtDzce9sJiLbqv5RA",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQz_XeoiR-eQVkM2UdqjORdCEx0WKPp-_EXjQTaoHvucDmKUOflNQ",
    };

    private static String[] userPostTexts = {
            "lunch time!",
            "beautiful day",
            "I am so hungry",
            "I miss him!",
    };

    public static ArrayList<TimeLine> getTimeLineLists() {
        return timeLineLists;
    }

    public static void setTimeLineLists(ArrayList<TimeLine> timeLineLists) {
        DataSource.timeLineLists = timeLineLists;
    }


    public static ArrayList<UserPost> getUserPostLists() {
        return userPostLists;
    }

    public static void setUserPostLists(ArrayList<UserPost> userPostLists) {
        DataSource.userPostLists = userPostLists;
    }


    public static void createDatas() {

        for (int i = 0; i < 4; i++) {
            Random rdm = new Random();
            String rmdNumLikes = Integer.toString((rdm.nextInt(50)));
            String rmdNumComments = Integer.toString((rdm.nextInt(50)));
            FeedBack feedback = new FeedBack(rmdNumLikes, rmdNumComments);
            TimeLine timeLine = new TimeLine(timelineUsernames[i], timelineUserImages[i], timelineimages[i], feedback, timelineMessages[i]);
            timeLineLists.add(timeLine);
        }

        setTimeLineLists(timeLineLists);
    }

    public static void createUserPostDatas() {

        for (int i = 0; i < 4; i++) {
            Random rdm = new Random();
            String rmdNumLikes = Integer.toString((rdm.nextInt(50)));
            String rmdNumComments = Integer.toString((rdm.nextInt(50)));
            FeedBack feedback = new FeedBack(rmdNumLikes, rmdNumComments);
            UserPost userPost = new UserPost(profileNames[i], profileImage[i], UserPostPictures[i], feedback, userPostTexts[i]);
            userPostLists.add(userPost);
        }
        setUserPostLists(userPostLists);
    }
}

