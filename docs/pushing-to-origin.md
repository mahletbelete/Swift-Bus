# Pushing to `origin` — Step by step

This short guide shows common PowerShell `git` commands to push your changes to the remote named `origin`.

Prerequisites

- You are inside the repo root.
- A remote named `origin` exists (`git remote -v`).

Steps

1. Check your current branch:

```powershell
git rev-parse --abbrev-ref HEAD
```

2. See what changed:

```powershell
git status
```

3. Stage files you want to include:

```powershell
# stage everything (including deletes/renames)
git add -A
# or stage specific files
git add path/to/file.jpg "docs/sequence make payment.jpg"
```

4. Commit your staged changes:

```powershell
git commit -m "Describe what you changed"
```

If an editor opens (COMMIT_EDITMSG), either save and exit or instead provide `-m` to skip the editor.

5. Push to `origin`:

```powershell
# Push current branch to origin
git push origin <branch>

# First push of a new branch (set upstream so future `git push`/`git pull` work):
git push -u origin <branch>
```

6. If the remote has new commits, pull first (recommended):

```powershell
git pull --rebase origin <branch>
```

7. Record a file move (if you moved a diagram):

```powershell
git mv "old/path.jpg" "docs/sequence make payment.jpg"
git commit -m "Move sequence diagram into docs/sequence"
git push origin <branch>
```

8. Danger: force your local to match remote (destructive):

```powershell
git fetch origin
git reset --hard origin/<branch>
```

Notes

- Replace `<branch>` with the branch name shown by `git rev-parse --abbrev-ref HEAD`.
- Use `git pull --rebase` to keep a cleaner history when integrating remote changes.
- Always double-check `git status` before committing or forcing resets.

That's it — follow these steps to push changes to `origin` from PowerShell.
