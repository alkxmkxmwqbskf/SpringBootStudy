package com.codefish.springbootfirst.vo;/**
 * @author codefish
 * @date 2021/12/5
 * @apinote
 */

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: codefish
 * @discription:
 */
@Component
@ConfigurationProperties(prefix = "school")
public class School {
    private String name;
    private String website;
    private String site;

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", website='" + website + '\'' +
                ", site='" + site + '\'' +
                '}';
    }
}
