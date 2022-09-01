package io.github.josealmir.designpatterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib {
    @Override
    public List<String> listVideos() {
        return new ArrayList<>();
    }

    @Override
    public String getVideoInfo(int id) {
        return "Video with id: " + id;
    }

    @Override
    public String downloadVideo(int id) {
        return "Info from video with id: " + id;
    }
}
