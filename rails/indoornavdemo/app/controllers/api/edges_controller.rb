class Api::EdgesController < Api::BaseController

  def create
    @edge = Edge.new(edge_params)

    if @edge.save
      respond_with @edge
    else
      render status: :internal_server_error
    end
  end

  protected
  def edge_params
    params.require(:edge).permit(:start_node_id, :end_node_id, :distance, :graph_id)
  end
end
