package top.itning.weibohotsearch.entity;

import java.io.Serializable;

/**
 * 词条
 *
 * @author wangn
 */
public class Entry implements Serializable, Comparable<Entry> {
    private int hot;
    private String value;

    public int getHot() {
        return hot;
    }

    public void setHot(int hot) {
        this.hot = hot;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "hot=" + hot +
                ", value='" + value + '\'' +
                '}';
    }

    @Override
    public int compareTo(Entry o) {
        return Integer.compare(this.hot, o.getHot());
    }
}
