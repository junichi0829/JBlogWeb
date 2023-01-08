package com.junichi.jblog.domain;


import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "USERS")
public class User {
	
	//主キーに対応する識別子の変数
	@Id
	// 1から始まって自動的に1ずつ増加するようにストラテジーを設定
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 			// 会員番号
	
	@Column(nullable = false, length = 50, unique = true)
	private String username;	// アカウント
	
	@Column(length = 100)
	private String password;	// パスワード
	
	@Column(nullable = false, length = 100)
	private String email;		// メールアドレス
	
	@Enumerated(EnumType.STRING)
	private RoleType role;
	
	@CreationTimestamp // 現在の時間がデフォルトに登録されるように設定
	private Timestamp createDate;
	
}
