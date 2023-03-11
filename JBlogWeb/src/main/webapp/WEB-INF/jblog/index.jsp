<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="/webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
<script src="/webjars/bootstrap/5.1.3/js/bootstrap.bundle.min.js"></script>
<script src="/webjars/jquery/3.6.0/dist/jquery.min.js"></script>
</head>
<body>

	<nav class="navbar navbar-expand-sm navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="/">Main</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#mynavbar">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="mynavbar">
				<ul class="navbar-nav me-auto">
					<li class="nav-item"><a class="nav-link" href="/auth/login">ログイン</a></li>
					<li class="nav-item"><a class="nav-link"
						href="/auth/insertUser">会員登録</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container-fluid mt-3">
		<div class="card">
			<div class="card-body">
				<h4 class="card-title">タイトル</h4>
				<a href="#" class="btn btn-secondary">詳細を見る</a>
			</div>
		</div>
	</div>
	<br>
	<div class="mt-5 p-4 text-center">
		<p>Created by Junichi</p>
		<p>連絡先 : kyo.junichi0829@gmail.com、住所 : 京畿道</p>
	</div>

</body>
</html>