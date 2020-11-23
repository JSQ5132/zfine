package com.ykxj.zfine.common.utils;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.ykxj.zfine.model.mysql.User;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.Md5Hash;

public final class EndecryptUtils
{
  public static User md5Password(String username, String password)
  {
    Preconditions.checkArgument(!Strings.isNullOrEmpty(username), "username不能为空");
    Preconditions.checkArgument(!Strings.isNullOrEmpty(password), "password不能为空");
    SecureRandomNumberGenerator secureRandomNumberGenerator = new SecureRandomNumberGenerator();
    String salt = secureRandomNumberGenerator.nextBytes().toHex();

    String password_cipherText = new Md5Hash(password, username + salt, 2).toHex();
    User user = new User();
    user.setPassword(password_cipherText);
    user.setSalt(salt);
    user.setName(username);
    return user;
  }

  /**
   * 检查用户MD5密码是否正确
   * @param username 用户名（登录账号）
   * @param unencryptedPassword 未加密密码密码
   * @param salt 盐值
   * @param md5CipherText MD5加密后的密码
   * @return
   */
  public static boolean checkMd5Password(String username, String unencryptedPassword, String salt, String md5CipherText)
  {
    Preconditions.checkArgument(!Strings.isNullOrEmpty(username), "username不能为空");
    Preconditions.checkArgument(!Strings.isNullOrEmpty(unencryptedPassword), "password不能为空");
    Preconditions.checkArgument(!Strings.isNullOrEmpty(md5CipherText), "md5cipherText不能为空");

    String password_cipherText = new Md5Hash(unencryptedPassword, username + salt, 2).toHex();
    return md5CipherText.equals(password_cipherText);
  }
}