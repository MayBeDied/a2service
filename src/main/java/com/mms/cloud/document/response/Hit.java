package com.mms.cloud.document.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * One of the hits that are actually returned.
 */
public class Hit<T> {
    @JsonProperty(value = "_index")
    private String index;

    @JsonProperty(value = "_type")
    private String type;

    @JsonProperty(value = "_id")
    private String id;

    @JsonProperty(value = "_score")
    private Double score;

    @JsonProperty(value = "_source")
    private T source;

    @JsonProperty(value = "sort")
    private String[] sort;
    
    @JsonProperty(value = "_version")
    private long version;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public T getSource() {
        return source;
    }

    public void setSource(T source) {
        this.source = source;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getSort() {
        return sort;
    }

    public void setSort(String[] sort) {
        this.sort = sort;
    }

	public long getVersion() {
		return version;
	}

	public void setVersion(long version) {
		this.version = version;
	}
}
