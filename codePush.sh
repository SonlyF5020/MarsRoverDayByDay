#!/bin/sh
echo "git push code"
git rm --cached .idea\*
git add .
git commit -m "code"
git push
echo "git done"