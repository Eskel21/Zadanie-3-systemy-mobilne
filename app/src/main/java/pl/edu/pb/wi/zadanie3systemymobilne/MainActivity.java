package pl.edu.pb.wi.zadanie3systemymobilne;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import android.os.Bundle;
import java.util.UUID;
public class MainActivity extends SingleFragmentActivity {

	protected Fragment createFragment() {
		UUID taskId = (UUID) getIntent().getSerializableExtra(TaskListFragment.KEY_EXTRA_TASK_ID);
		return TaskFragment.newInstance(taskId);
	}
}