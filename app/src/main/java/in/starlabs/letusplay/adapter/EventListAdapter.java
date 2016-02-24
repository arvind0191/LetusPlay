package in.starlabs.letusplay.adapter;

import android.content.Context;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import in.starlabs.letusplay.R;
import in.starlabs.letusplay.holder.EventViewHolder;
import in.starlabs.letusplay.model.GameHelper;

/**
 * Created by Arvind on 24/02/16.
 */
public class EventListAdapter extends ArrayAdapter implements AdapterView.OnItemClickListener {
    private LayoutInflater inflater;
    List<GameHelper> list ;

    public EventListAdapter(Context context, List<GameHelper> resource) {
        super(context, R.layout.item_event_list,resource);
        this.list = resource;
        inflater = LayoutInflater.from(context);

    }


    public View getView(final int position, View convertView, ViewGroup parent) {
        EventViewHolder holder;
        if(convertView ==null) {
            holder = new EventViewHolder();
            convertView = inflater.inflate(R.layout.item_event_list, null, true);
            holder.imageView = (ImageView) convertView.findViewById(R.id.iv_eventpic);
            holder.textView = (TextView) convertView.findViewById(R.id.tv_eventname);
            convertView.setTag(holder);
        }
        else {
            holder = (EventViewHolder) convertView.getTag();
        }
        GameHelper helper = (GameHelper)list.get(position);
        holder.imageView.setImageResource(R.drawable.ic_action_user);
        holder.textView.setText(helper.getEventName());
        return convertView;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
