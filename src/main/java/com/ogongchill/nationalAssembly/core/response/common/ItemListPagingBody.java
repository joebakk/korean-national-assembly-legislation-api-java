package com.ogongchill.nationalAssembly.core.response.common;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ItemListPagingBody<T> extends ItemListBody<T> {

    @JacksonXmlProperty(localName = "numOfRows")
    private Integer numOfRows;

    @JacksonXmlProperty(localName = "pageNo")
    private Integer pageNo;

    @JacksonXmlProperty(localName = "totalCount")
    private Integer totalCount;

    public Integer getNumOfRows() {
        return numOfRows;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public Integer getTotalCount() {
        return totalCount;
    }
}
