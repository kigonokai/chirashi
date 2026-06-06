#!/bin/bash

GITHUB_USER="kigonokai"
GITHUB_TOKEN="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"
REPO_NAME="chirashi"

REMOTE_URL="https://${GITHUB_USER}:${GITHUB_TOKEN}@github.com/${GITHUB_USER}/${REPO_NAME}.git"

if ! git remote | grep -q "origin"; then
    git remote add origin "$REMOTE_URL"
    git remote set-url origin "$REMOTE_URL"
fi

git add .

echo -n "コミットメッセージを入力してください（空欄なら 'Update code'）: "
read COMMIT_MSG
MSG=${COMMIT_MSG:-"Update code"}

git commit -m "$MSG"

echo "GitHubへ送信中..."
git push -u origin master

echo "送信が完了しました！GitHub Actionsのビルドを確認してください。"
