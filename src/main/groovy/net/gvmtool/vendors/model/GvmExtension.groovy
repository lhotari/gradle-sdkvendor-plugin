package net.gvmtool.vendors.model

import org.hibernate.validator.constraints.URL

import javax.validation.constraints.NotNull

class GvmExtension {

    @URL
    String apiUrl = "https://vendor.gvmtool.net"

    @NotNull
    String consumerKey

    @NotNull
    String consumerToken

    @NotNull
    String candidate

    @NotNull
    String version

    @NotNull
    @URL
    String url

    String hashtag

    @Override
    public String toString() {
        return "GvmExtension{" +
                "apiUrl='" + apiUrl + '\'' +
                ", consumerKey='" + consumerKey + '\'' +
                ", consumerToken='" + consumerToken + '\'' +
                ", candidate='" + candidate + '\'' +
                ", version='" + version + '\'' +
                ", url='" + url + '\'' +
                ", hashtag='" + hashtag + '\'' +
                '}';
    }
}