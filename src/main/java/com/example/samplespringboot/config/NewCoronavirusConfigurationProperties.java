package com.example.samplespringboot.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.stereotype.Component;


/**
 * 新型コロナウイルス関連設定
 */
@Component
@ConfigurationProperties("app.new-coronavirus")
public record NewCoronavirusConfigurationProperties(
        @NestedConfigurationProperty Url url) {

    @Getter
    @RequiredArgsConstructor
    public static class Url {

        /**
         * 日付と県のクエリパラメータのテンプレート付きのURL
         *
         * <p>
         * 例
         * <ul>
         *     <li>https://opendata.corona.go.jp/api/Covid19JapanAll?date={yyyyMMdd}&dataName={都道府県}
         * </ul>
         */
        private final String specifiedDateAndPrefecturesData;

    }


}
