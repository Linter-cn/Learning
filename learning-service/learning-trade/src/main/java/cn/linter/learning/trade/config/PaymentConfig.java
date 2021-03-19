package cn.linter.learning.trade.config;

import com.alipay.easysdk.factory.Factory;
import com.alipay.easysdk.kernel.Config;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * 支付配置类
 *
 * @author wangxiaoyang
 * @since 2021/3/19
 */
@Component
public class PaymentConfig implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        Config config = new Config();
        config.protocol = "http";
        config.gatewayHost = "openapi.alipaydev.com/gateway.do";
        config.signType = "RSA2";

        config.appId = "2021000116691343";

        config.merchantPrivateKey = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQDC2vDwxiuXIWYhecZ7a2yzdZvvdiWPYP9s00KRCmuxmwyZJ7lMyhHsHzKcmlCQnOQg94i1E2OYZj1rwvZ1v9yMCja0uUS+GpOv/+VRlwPunPjrDMz9RiRIKYavYdLbvwwaW3b6W755tYkEZha4eFeQ353WPkO4xEtmGXqw0mxCNkobUpjYntuShlpt6Zk9DRD2M0H+O268/ZeVQynCplLKNwa7P+3KtXp1KAvMd5v6FxvjCN1GmAxk+IroOWocabeXaGy2p4eVWoiUXIyUxGqKcTuLO6wvqRmvOeBPZg+Xjt/+/xexWqrTsS0bR3fzF7UoKrji41uxaSubTcLoIlx3AgMBAAECggEBAK5DRiXe5Q8VJJSdpr+sFBvu+5VN8UtoMScvTKIQUr4U71BtcU/Wi+7C++2IKLMcTP2awx1GCNU74oRkaSxneSOY4tH/uxXVCO3nCjxMtYyJwCfeW9nLCBmtYbGp5/z0wCs2T5KZyCBrFO3lKz6xCYccJbl8F+6/Rrs54DsRBRa0jFEozhi3X5DcKl54mVuY/U5xgmFwSacbtyg/EmBH+U7Yol+ELpJ+FC+D6PUofro/YmugHcT2q6btmQOlBbymUDWIh2vraALSbC7Kqjh1+M3SE3yJt3RGEjJodg7QB9OgWFpcYG/iV+OMN2zfJ/4XqSPW+zkJ+M84vdO93yoyyrECgYEA7+eBevUn5Q8jB4L54nojRbGUfXyZf116CTLbic6BMnto4dzgTpPI9YKyjPTvBOXIY4iAi6SGbueRuNqF5vGtGcESZOoKDoCwvaW2SPQt2mb2o+d2C7WJ9c5/2x4ZVgEAJ8CfMT9xA8J3t+vBFUW0Jq7k6livzaxtYws3Nl8O3O8CgYEAz+2xDT/XWZLP0Y3rlkyWq9OtzWHGgY5/GrDXI+la5lXGx2tYeLNstfJXMs/Jmcec90w1THqPcIVb0GAPV+I34npDrn5hVDT4Rv+Dnm7TPlObpFoGhfyKkWpSbFhi957vJJZ1+LFCdHeOhTlHr8JBWxWn+yt0YurYJYHR4iyaCPkCgYEA4c6wCwHx+SJUQF/BwLBhvtm1AKBlAoMDuODLz1w2M0QBpoZ2AsALqTrJwO9SgvOduEHlbIsBliYU/T+CRaw42ELog1/e82Oh9/+gIe7jsey0PfZBIChRoLIrmh0sj80FTmV58arbP0St1snqxZEETlzUTtgHMboYg98sqtqybLUCgYARN9qogTfhCAJDlSAEIzV65x2GW2lnwxgNasV2CNXpKwM58k6yOBFxg67q20AThu8dn2bufVuxcqmmuL2shmQgUgWWxopiwbwpjPEmRoEhsSS7WGUf5UjIP+ixZiRT4wpkmj0MqgkZwejAaXzhNhHZbBKr/u41XsMlX/m0ZAMhaQKBgQCpoHMDQhmnrB+SYV6DUPnH3NhbeZaNL97ZGi7Tqz/WZS83J9L3G/JDN78HNuVyGRckkKPCvtUcMJ0tuJso5MtjqzHda3CFhv7tAEtNuQb+9lx+s/zcCtXhrK8xIs9fu9dEICBh8WxT4aN3gKFJfFyl5+WMtOYQhxnGLNG3ZbTiDA==";

        config.alipayPublicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAoAAe4h8/OnDK/2GyJleiOFBnrAYfn347sZd+4wpUUpkHrDHp88rYCUuEInPwvJqUmKLFC1pd0SroowvULsIl6bR4lF1Gp2LMUHJVVtEghSJKvZQL5AAEup5+mi0bFQMpcYKCHnT3nvjZ7VuWuEWuAB0JvlNr/Hlc+DaVcox8NObiCwh6V8u5eOY/ILsx7X6v91Qlnvgfv811lsAHX0RTsm0z6B/CUaKkwsDpvUI90yfSEvnQQieyUoGQAtzn7GQBesg0gcPmmgq1YSO+K6/kAO/K2CGzo+g1o+Jke33MANeWtOBDdXZdhynQ/Yv7Xca8sF8+uwkzj0IdeeBM4JtLOQIDAQAB";

        //config.notifyUrl = "<-- 请填写您的支付类接口异步通知接收服务地址，例如：https://www.test.com/callback -->";

        Factory.setOptions(config);
    }

}
