package ru.fefu.activitiesfefu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import ru.fefu.activitiesfefu.databinding.FragmentHistoryBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HistoryFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HistoryFragment : BaseActivityListFragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun getActivityList(): List<ActivityListItem> = listOf(
        ActivityListItem.Section("Сегодня"),
        ActivityListItem.Activity(
            distance = "11.11 км",
            duration = "1 часа 11 минут",
            type = "Плавание",
            user = "@pinckman",
            timeAgo = "11 часов назад"
        ),
        ActivityListItem.Activity(
            distance = "6 кругов",
            duration = "3 минуs",
            type = "Карусель",
            user = "@walterwhite",
            timeAgo = "11 часов назад"
        ),
        ActivityListItem.Activity(
            distance = "10 км",
            duration = "1 час 10 минут",
            type = "Бег",
            user = "@instasamka",
            timeAgo = "11 часов назад"
        )
    )

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HistoryFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HistoryFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}