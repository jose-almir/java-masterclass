package io.github.josealmir.designpatterns.structural.proxy;

import java.util.List;

public interface ThirdPartyYoutubeLib {
    List<String> listVideos();

    String getVideoInfo(int id);

    String downloadVideo(int id);
}
