package com.ogongchill.nationalAssembly.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ogongchill.nationalAssembly.api.Operation;
import com.ogongchill.nationalAssembly.response.RecentRceptListResponse;
import com.ogongchill.nationalAssembly.response.item.RecentRceptListItem;
import lombok.Builder;
import lombok.Data;

/**
 * <a href="https://www.data.go.kr/data/3037286/openapi.do">IROS4_OA_DV_0401_OpenAPI활용가이드_의안정보(국회사무처)_v1.30<</a></href>의 <code>getRecentPasageList</code>요청 파라미터임
 * @see Operation
 * @see RecentRceptListResponse
 * @see RecentRceptListItem
 */
@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RecentPasageListRequest {
    /**
     * 한 페이지 결과 수, 기본값은 10
     */
    private Integer numOfRows;

    /**
     * 페이지 번호
     */
    private Integer pageNo;

    /**
     * 의안명
     */
    private String bill_name;
}