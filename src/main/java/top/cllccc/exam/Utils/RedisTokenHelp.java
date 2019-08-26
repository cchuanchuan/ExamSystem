package top.cllccc.exam.Utils;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.cllccc.exam.domain.dto.TokenModel;

import java.util.UUID;

/**
 * <h1>Token管理类</h1>
 *
 * @Author: CCC
 * @Date 2019/8/22 17:49
 */
@Component
public class RedisTokenHelp {

    @Autowired
    private RedisClient redisClient;

    /**
     * token信息存储redis，默认有效时间{@link RedisClient.TOKEN_EXPIRES_SECOND}
     * @param tokenModel token信息
     */
    public void create(TokenModel tokenModel) {
        redisClient.set(tokenModel.getKey(), tokenModel.getTokenInfo(), RedisClient.TOKEN_EXPIRES_SECOND);
    }

    /**
     * 查询token，且自动刷新token有效期
     * @param model
     * @return 是否查询成功
     */
    public boolean check(TokenModel model) {
        boolean result = false;
        System.out.println("redisClient= "+redisClient);
        if(model != null) {
            String key = model.getKey();
            String token = model.getTokenInfo();
            String authenticatedToken = redisClient.get(key);
            if(authenticatedToken != null && authenticatedToken.equals(token)) {
                redisClient.expire(key, RedisClient.TOKEN_EXPIRES_SECOND);
                result = true;
            }
        }
        return result;
    }

    /**
     * 获取token信息
     * @param authStr
     * @return
     */
    /*public TokenModel get(String key) {
        TokenModel model = null;
        if(StringUtils.isNotEmpty(key)) {
            String[] modelArr = key.split("_");
            if(modelArr.length == 2) {
                int userId = Integer.parseInt(modelArr[0]);
                String token = modelArr[1];
                model = new TokenModel(userId, token);
            }
        }
        return model;
    }*/

    /**
     * 删除token信息
     * @param key
     * @return
     */
    public boolean delete(String key) {
        return redisClient.remove(key);
    }

}