package com.hubery.common;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * 类名：AesUtil.java
 * 路径：com.hubery.utils
 * 创建人：kgh
 * 创建时间：2020/1/11 13:32
 * 功能：使用AES实现加解密
 * 修改人：
 * 修改时间：
 * 修改备注：
 */
public class AesUtil {

    /*public static void main(String[] args) {
        String content = "test"; // 加密的字符串
        String addPwd = "test"; // 加解密密钥

        // 加密
        System.out.println("加密前content：" + content);
        String encryptResultStr = encrypt(content, addPwd);
        System.out.println("加密后content：" + encryptResultStr);
        // 解密
        String userAccount = AesUtil.decrypt(encryptResultStr, addPwd);
        System.out.println("解密后content：" + userAccount);
    }*/


    /**
     * 方法名：encrypt
     * 功能：加密方法
     * 创建人：
     * 创建时间：
     * 入参：
     * 出参：
     * 修改人：
     * 修改时间：
     * 修改备注：
     */
    public static String encrypt(String data, String key) {
        byte[] enAccount = encryptIn(data, key);
        String encryptResultStr = parseByte2HexStr(enAccount);
        return encryptResultStr;
    }

    /**
     * 方法名：decrypt
     * 功能：解密方法
     * 路径：com.hubery.utils
     * 创建人：kgh
     * 创建时间：2020/1/11 13:32
     * 功能：使用AES实现加解密
     * 修改人：
     * 修改时间：
     * 修改备注：
     */
    public static String decrypt(String data, String key) {
        byte[] accountFrom = AesUtil.parseHexStr2Byte(data);
        byte[] deAccount = AesUtil.decryptOut(accountFrom, key);
        String userAccount = new String(deAccount);
        return userAccount;
    }

    /**
     * 方法名：encryptIn
     * 功能：解密算法
     * 创建人：
     * 创建时间：
     * 入参：content：要加密的内容，password：加密使用的密钥
     * 出参：加密后的字节数组
     * 修改人：
     * 修改时间：
     * 修改备注：

     */
    public static byte[] encryptIn(String content, String password) {
        SecureRandom random = null;
        try {
            random = SecureRandom.getInstance("SHA1PRNG");
            random.setSeed(password.getBytes());
        } catch (NoSuchAlgorithmException e1) {
            e1.printStackTrace();
        }

        try {
            KeyGenerator kgen = KeyGenerator.getInstance("AES");
            kgen.init(128, random);
            SecretKey secretKey = kgen.generateKey();
            byte[] enCodeFormat = secretKey.getEncoded();
            SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");
            Cipher cipher = Cipher.getInstance("AES");// 创建密码器
            byte[] byteContent = content.getBytes("utf-8");
            cipher.init(Cipher.ENCRYPT_MODE, key);// 初始化
            byte[] result = cipher.doFinal(byteContent);
            return result; // 加密
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 方法名：parseByte2HexStr
     * 功能：将二进制转换成16进制 加密
     * 创建人：
     * 创建时间：
     * 入参：
     * 出参：
     * 修改人：
     * 修改时间：
     * 修改备注：
     */
    public static String parseByte2HexStr(byte buf[]) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < buf.length; i++) {
            String hex = Integer.toHexString(buf[i] & 0xFF);
            if (hex.length() == 1) {
                hex = '0' + hex;
            }
            sb.append(hex.toUpperCase());
        }
        return sb.toString();
    }

    /**
     * 方法名：decryptOut
     * 功能：解密算法
     * 创建人：
     * 创建时间：
     * 入参：content：待解密内容，password：解密密钥
     * 出参：解密后的字节数组
     * 修改人：
     * 修改时间：
     * 修改备注：
     */
    public static byte[] decryptOut(byte[] content, String password) {
        SecureRandom random = null;
        try {
            random = SecureRandom.getInstance("SHA1PRNG");
            random.setSeed(password.getBytes());
        } catch (NoSuchAlgorithmException e1) {
            e1.printStackTrace();
        }
        try {
            KeyGenerator kgen = KeyGenerator.getInstance("AES");
            kgen.init(128, random);
            SecretKey secretKey = kgen.generateKey();
            byte[] enCodeFormat = secretKey.getEncoded();
            SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");
            Cipher cipher = Cipher.getInstance("AES");// 创建密码器
            cipher.init(Cipher.DECRYPT_MODE, key);// 初始化
            byte[] result = cipher.doFinal(content);
            return result; // 加密
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 方法名：parseHexStr2Byte
     * 功能：将16进制转换为二进制
     * 创建人：
     * 创建时间：
     * 入参：
     * 出参：
     * 修改人：
     * 修改时间：
     * 修改备注：
     */
    public static byte[] parseHexStr2Byte(String hexStr) {
        if (hexStr.length() < 1){
            return null;
        }
        byte[] result = new byte[hexStr.length() / 2];
        for (int i = 0; i < hexStr.length() / 2; i++) {
            int high = Integer.parseInt(hexStr.substring(i * 2, i * 2 + 1), 16);
            int low = Integer.parseInt(hexStr.substring(i * 2 + 1, i * 2 + 2), 16);
            result[i] = (byte) (high * 16 + low);
        }
        return result;
    }

}
