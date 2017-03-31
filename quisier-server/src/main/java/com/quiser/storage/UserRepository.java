package com.quiser.storage;

import com.quiser.business.LoginInfo;
import com.quiser.business.UserInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by yf_zh on 3/28/2017.
 */
public interface UserRepository extends MongoRepository<UserInfo, String> {
    public UserInfo findById(String id);
//    public List<LoginInfo> findByEmail(String email);
}