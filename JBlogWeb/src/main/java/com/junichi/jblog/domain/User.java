package com.junichi.jblog.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
	
	private int id; 			// 会員番号
	private String username;	// アカウント
	private String password;	// パスワード
	private String email;		// メールアドレス
	
}
