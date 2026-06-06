
# 現在のブランチ名を取得（デフォルトはmaster）
BRANCH=$(git branch --show-current)
if [ -z "$BRANCH" ]; then
    BRANCH="master"
fi

# 1. 変更されたファイルをすべてステージング
git add .

# 2. ユーザーに入力してもらったメッセージでコミット
# 入力が空の場合はデフォルトのメッセージを使用
echo "コミットメッセージを入力してください（空欄の場合は 'Auto commit update'）:"
read COMMIT_MSG

if [ -z "$COMMIT_MSG" ]; then
    COMMIT_MSG="Auto commit update"
fi

git commit -m "$COMMIT_MSG"

# 3. 指定されたリモートブランチへ直接プッシュ
echo "GitHubへプッシュしています ($BRANCH ブランチ)..."
git push origin "$BRANCH"

echo "プッシュが完了しました！"