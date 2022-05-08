package com.example.samplespringboot.config;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;


@DisplayName("コロナデータ関連設定のテスト")
@SpringBootTest(classes = {TestNewCoronavirusConfigurationProperties.class})
@ActiveProfiles("new-coronavirus-configuration-properties-test")
class NewCoronavirusConfigurationPropertiesTest {

    @Autowired
    private NewCoronavirusConfigurationProperties newCoronavirusConfigurationProperties;

    @Nested
    @DisplayName("日付と県を指定してコロナの情報を取得するテンプレートURLの設定の場合")
    class SpecifiedDateAndPrefecturesCaseTest {

        @Test
        @DisplayName("設定にhttps://opendata.corona.go.jp/api/Covid19JapanAll?date={yyyyMMdd}&dataName={県名}が設定されているときに同じ値が取得できること")
        void WhenPresentPropertyTest() {

            Assertions.assertEquals("https://opendata.corona.go.jp/api/Covid19JapanAll?date={yyyyMMdd}&dataName={県名}",
                    newCoronavirusConfigurationProperties.url().getSpecifiedDateAndPrefecturesData());

        }
    }

}
