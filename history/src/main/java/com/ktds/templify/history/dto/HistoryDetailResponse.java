package com.ktds.templify.history.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class HistoryDetailResponse {
    private Long id;
    private String requestId;
    private String originalText;
    private String transformedText;
    private String templateName;
    private String modelName;
    private Integer tokenCount;
    private Integer processingTime;
    private LocalDateTime transformedAt;
}
