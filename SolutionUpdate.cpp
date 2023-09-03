#include <iostream>
#include <vector>
#include <utility> // for using pairs
#include <map>
using namespace std;

class Solution {
public:
    vector<int> matching;
    vector<int> vis;
    map<int, int> lastMatching; // Store the last matching result for each person

    bool solve(int person, vector<vector<int> >& G) {
        for (int job = 0; job < G[0].size(); job++) {
            if (G[person][job] && !vis[job]) {
                vis[job] = 1;
                if (matching[job] == -1 || solve(matching[job], G)) {
                    matching[job] = person;
                    lastMatching[person] = job; // Update the last matching result for this person
                    return true;
                }
            }
        }
        return false;
    }

    int maximumMatch(vector<vector<int> >& G) {
        int p = G.size();
        int j = G[0].size();
        int ans = 0;
        matching = vector<int>(j, -1);

        for (int i = 0; i < p; i++) {
            vis = vector<int>(j, 0);
            if (solve(i, G)) {
                ans++;
            }
        }
        return ans;
    }
};

int main() {
    int tc;
    cin >> tc;
    map<int, int> lastResults; // Store the last result for each left-side member

    while (tc--) {
        int m, n;
        cin >> m >> n;
        vector<vector<int> > G(m, vector<int>(n, 0));
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                cin >> G[i][j];
            }
        }
        Solution obj;
        int ans = obj.maximumMatch(G);

        // Update the last result for each left-side member
        for (int i = 0; i < m; i++) {
            lastResults[i] = obj.lastMatching[i];
        }
    }

    // Print the last result for each left-side member using a traditional for loop
    cout << "Last Matching Results:\n";
    for (map<int, int>::iterator it = lastResults.begin(); it != lastResults.end(); ++it) {
        cout << "Person " << it->first << " matches with Job " << it->second << "\n";
    }

    return 0;
}

