
GITHUB_USER="kigonokai"
# トークンはここには書かず、環境変数（Termuxの一時メモリ）から読み込む
GITHUB_TOKEN="$GH_TOKEN"
REPO_NAME="chirashi"

REMOTE_URL="https://${GITHUB_USER}:${GITHUB_TOKEN}@github.com/${GITHUB_USER}/${REPO_NAME}.git"

# 送信先URLを毎回最新の状態に更新
git remote remove origin 2>/dev/null
git remote add origin "$REMOTE_URL"

git add .

echo -n "コミットメッセージを入力してください（空欄なら 'Update code'）: "
read COMMIT_MSG
MSG=${COMMIT_MSG:-"Update code"}

git commit -m "$MSG"

echo "GitHubへ送信中..."
git push -u origin master

echo "送信が完了しました！"