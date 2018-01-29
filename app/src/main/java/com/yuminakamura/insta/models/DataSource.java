package com.yuminakamura.insta.models;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by yuminakamura on 2018-01-26.
 */

public class DataSource {

    static ArrayList<TimeLine> timeLineLists = new ArrayList<>();

    private static final String[] usernames = {
            "Yuumi",
            "Jaewon",
            "Kento",
            "Sayaka"
    };

    private static final String[] userImages = {
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ1Hta2HGlh5q_Ih6bHaJnOfHqEDfF4rLv5SeB64UReNZolZ0KB",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT3txWR1VnvBnZ1GU9FHKU4H_r6owCHs83CZ_rjqmLmpCnj4jb4_w",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSEvsXv5qJyIWVqlT6ow4xAigMBvA-VrYd5hCeRU7wPDlF911xe",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiuafUmGudjFGoPou5Pg70xmwMy4U_MxVNuMKuXo-RDCPourE5"};

    private static final String[] timelinePictures = {
            "https://pbs.twimg.com/media/DNPCQj2VQAMQstm.jpg",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQ-Ys4vXTh3sCJ11DY28UBKg4q2LiKh-afEb-Mb-mlnr8pes4R",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRZJLKVge0H2nK9zyG5HfzTWb8DKdVrHsPCWYrO73ZxH33OA3of",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT9Y2yaCkiWPyr8-m895g4PILnWBuFo0-d2rw_b_829ntQFAGTBMw",
    };

    private static final String[] photoMessages = {
            "so happy",
            "yummy yummy ",
            "sunny days :)",
            "what a bad day..."
    };

    private static String[] profileTimelinePictures = {
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR6sbrpPqjSLw1w-mkU35Syz2xCwlHDHErQ-Wj70FKzuCwrM9SP",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQO8HMlma6BuK-ssWuR5HpdsRSXSqsf_fxm3Bo5Pleq2rMxdl0T",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSsRBh2ftIXuE3BdV3yccigTcxRE8gh_zI6CDtDzce9sJiLbqv5RA",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQz_XeoiR-eQVkM2UdqjORdCEx0WKPp-_EXjQTaoHvucDmKUOflNQ",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRTUZackeR6wcSepZ5-c_cFy1PkWL4eGthnmVy6uI-JMV__WB2Fwg",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZebw8AeUTEIxFCdVhDU2354KCqCA5vRGN1ZvrUTS2WBzhR579",
            "http://www.lovethispic.com/uploaded_images/90450-Vanessa-And-Zac.jpg",
            "data:image/jpeg;base64,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"
    };

    private static String[] profileTimelineTexts = {
            "lunch time!",
            "beautiful day",
            "I am so hungry",
            "I miss him!",
            "what to do...what to do..",
            "tmr is a better day!",
            "smile :)",
            "sleepy sleepy sleepy..zzzzzzzzzz",
    };

    public static ArrayList<TimeLine> getTimeLineLists() {
        return timeLineLists;
    }

    ;

    public static void setTimeLineLists(ArrayList<TimeLine> timeLineLists) {
        DataSource.timeLineLists = timeLineLists;
    }

    public static void createDatas() {

        for (int i = 0; i < 4; i++) {
            Random rdm = new Random();
            String rmdNumLikes = Integer.toString((rdm.nextInt(50)));
            String rmdNumComments = Integer.toString((rdm.nextInt(50)));
            FeedBack feedback = new FeedBack(rmdNumLikes, rmdNumComments);
            TimeLine timeLine = new TimeLine(usernames[i], userImages[i], timelinePictures[i], feedback, photoMessages[i]);
            timeLineLists.add(timeLine);
        }

        setTimeLineLists(timeLineLists);
//        myAdapter.setTimeLinelists(timeLineLists);

    }

//    public static ArrayList<TimeLine> createDatas() {
//
//        for (int i = 0; i < 4; i++) {
//            Random rdm = new Random();
//            String rmdNumLikes = Integer.toString((rdm.nextInt(50)));
//            String rmdNumComments = Integer.toString((rdm.nextInt(50)));
//            FeedBack feedback = new FeedBack(rmdNumLikes, rmdNumComments);
//            TimeLine timeLine = new TimeLine(usernames[i], userImages[i], timelinePictures[i], feedback, photoMessages[i]);
//            timeLineLists.add(timeLine);
//        }
//
////        setTimeLineLists(timeLineLists);
////        myAdapter.setTimeLinelists(timeLineLists);
//        return timeLineLists;
//    }


}

