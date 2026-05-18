-- RPT: 리포트 생성 시 선택한 심화기록 개수 저장 (커리어 리포트 상세 서브텍스트용)
ALTER TABLE reports ADD COLUMN selected_star_count int NOT NULL DEFAULT 0;
