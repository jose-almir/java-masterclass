package io.github.josealmir.designpatterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class CachedYoutubeClass implements ThirdPartyYoutubeLib{
    private ThirdPartyYoutubeLib lib;
    private List<String> listCache;
    private String videoCache;
    private boolean needReset;

    public CachedYoutubeClass(ThirdPartyYoutubeLib lib) {
        this.lib = lib;
    }
    @Override
    public List<String> listVideos() {
        if(listCache == null || needReset) {
            listCache = lib.listVideos();
        }
        return listCache;
    }

    @Override
    public String getVideoInfo(int id) {
        if(videoCache == null || needReset) {
            videoCache  = lib.getVideoInfo(id);
        }

        return videoCache;
    }

    @Override
    public String downloadVideo(int id) {
        return lib.downloadVideo(id);
    }
}
