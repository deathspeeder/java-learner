package org.nowhere.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by junwang on 16-5-9.
 */
public class SortObjects {
    public static class Tag {
        private long level;
        private String name;

        public Tag(long level, String name) {
            this.level = level;
            this.name = name;
        }
    }

    /**
     * Compare tags by its level and name. The smaller the level is, the smaller the tag. If levels are the same, the
     * smaller name is, the smaller tag.
     * 
     * @param list
     */
    public static void sortTags(List<Tag> list) {
        // TODO implement this
    }

    public static void main(String[] args) {
        Tag tag1 = new Tag(1, "Beijing");
        Tag tag2 = new Tag(1, "Shanghai");
        Tag tag3 = new Tag(2, "Taibei");
        Tag tag4 = new Tag(1, "Chongqing");

        List<Tag> tagList = new ArrayList<Tag>();
        tagList.add(tag1);
        tagList.add(tag2);
        tagList.add(tag3);
        tagList.add(tag4);

        sortTags(tagList);
    }
}
