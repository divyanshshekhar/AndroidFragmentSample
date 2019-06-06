
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.trinity.fragmentsample;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements
        Fragment1.OnFragmentInteractionListener,
        Fragment2.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Load the first fragment.
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragment_container, Fragment1.newInstance())
                .commit();
    }

    /**
     * Handle next button click event in Fragment 1.
     */
    public void onNextButtonClick() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, Fragment2.newInstance())
                .commit();
    }

    /**
     * Handle previous button click event in Fragment 2.
     */
    public void onPrevButtonClick() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, Fragment1.newInstance())
                .commit();
    }
}
